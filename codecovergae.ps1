param (	

 [string]$BuildDefID,
 [string]$TaskVersion,
 [string]$TeamProject,
 [string]$TfsUrl
)

 $frmDate = "2018/01/01";
 $toDate =  "2018/03/01";

	#TFS URL - Change this when Moved to production 
	$TfsUrl = 'http://alm-prod-app1:8080/tfs/boc_projects/'
	$apiVersion = "2.0" 
    $TeamProject="CAL"
$pathToJsonFile="c:\temp\update.json"
$pathToOutputFile="c:\temp\update.csv"
#GET https://{instance}/DefaultCollection/{project}/_apis/test/runs/{run}/codeCoverage?api-version={version}[&flags={int}]
#https://fabrikam-fiber-inc.visualstudio.com/DefaultCollection/Fabrikam-Fiber-Git/_apis/build/builds?definitions=25&statusFilter=completed&$top=1&api-version=2.0
#https://fabrikam-fiber-inc.visualstudio.com/DefaultCollection/Fabrikam-Fiber-Git/_apis/build/definitions?api-version=2.0
#GET https://{instance}/DefaultCollection/{project}/_apis/test/codeCoverage?api-version={version}[&buildId={int}&flags={int}]
$url = $TfsUrl + $TeamProject + "/_apis/test/codeCoverage?api-version=2.0-preview.1&buildId=735421"

	#Append the link with Team Project and Build Definition ID.
	#$url = $TfsUrl + $TeamProject + "/_apis/build/definitions?api-version=2.0"
#https://fabrikam-fiber-inc.visualstudio.com/DefaultCollection/Fabrikam-Fiber-Git/_apis/build/builds?definitions=25&statusFilter=completed&$top=1&api-version=2.0
#$url = $TfsUrl + $TeamProject + "/_apis/build/builds&api-version=2.0"
	#Print the Inputs parameters

	#write-output "BuildDefintion ID : $BuildDefID"
	#write-output "Task Version to update : $TaskVersion"
	#write-output " Team Project : $TeamProject" 
	#$json =Invoke-RestMethod -uri "http://alm-mig-app1:8080/tfs/boc_projects/Build/_apis/build/definitions/2929?api-version=2.0" -UseDefaultCredentials -Method Get -ContentType 'application/json' | -raw ConvertFrom-Json
    write-output $url
	##Invoke-RestMethod -uri $url -UseDefaultCredentials -Method Get -ContentType 'application/json' -OutFile c:\temp\codecovergae.json
	#Invoke-RestMethod -Uri $uri -UseDefaultCredentials -Method Get -ContentType 'application/json' -OutFile c:\update.json
##	$json = (get-content $pathToJsonFile -raw | ConvertFrom-Json)| Select changesetid,author,createddate | Convertto-CSV -NoTypeInformation
 
 
     $json=Invoke-RestMethod -uri $url -UseDefaultCredentials -Method Get -ContentType 'application/json' 
     write-output $json.coverageData.coverageStats[1].covered
     #$sheet.cells.item($rowCity+$i,$colCity).value() = $json.count 
    

 

 
	