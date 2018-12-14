param (	

 [string]$TFSPath,
 [string]$TaskVersion,
 [string]$TeamProject,
 [string]$TfsUrl,
[string] $frmDate,
[string] $ToDate
)

 
 $file = "C:\temp\book2.xlsx"
$sheetName = "Sheet1"

	#TFS URL - Change this when Moved to production 
	$TfsUrl = 'http://alm-prod-app1:8080/tfs/boc_projects/'
	$apiVersion = "2.0" 
    $TeamProject="CAL"

    $frmDate = "2018/01/01";
    $toDate =  "2018/03/01";
   
    $objExcel = New-Object -ComObject Excel.Application
    $workbook = $objExcel.Workbooks.Open($file)
    $sheet = $workbook.Worksheets.Item($sheetName)
    $objExcel.Visible=$false
    $rowMax = ($sheet.UsedRange.Rows).count
    write-host $rowMax
    $rowName,$colName = 1,1
    $rowAge,$colAge = 1,2
    $rowCity,$colCity = 1,3

    for ($i=1; $i -le $rowMax-1; $i++)
    {
    $frmDate1 = $sheet.Cells.Item($rowName+$i,$colName).text
    $toDate = $sheet.Cells.Item($rowAge+$i,$colAge).text
    #$frmDate1 = $sheet.Cells.Item(1,1).text
    Write-Host $frmDate1 " - "  $ToDate
    $url = $TfsUrl + $TeamProject + "/_apis/tfvc/changesets?api-version=1.0&itemPath=$/CAL/Dev/Src&fromDate=$frmDate1&toDate=$toDate"
     $json=Invoke-RestMethod -uri $url -UseDefaultCredentials -Method Get -ContentType 'application/json' 
     write-output $json.count
     $sheet.cells.item($rowCity+$i,$colCity).value() = $json.count 
    
    }


     $url = $TfsUrl + $TeamProject + "/_apis/test/codeCoverage?api-version=2.0-preview.1&buildId=735421"
     $json=Invoke-RestMethod -uri $url -UseDefaultCredentials -Method Get -ContentType 'application/json' 
     write-output $json.coverageData.coverageStats[1].covered
     $sheet.cells.item(1,4).value() = $json.coverageData.coverageStats[1].covered
     $sheet.cells.item(1,5).value() = $json.coverageData.coverageStats[1].total
    

   $workbook.Save()  
   $workbook.Close()
   $objExcel.Quit()

 #Start-Sleep 1
 #$ws.cells.item(1,3).value() = $json.count 

 
