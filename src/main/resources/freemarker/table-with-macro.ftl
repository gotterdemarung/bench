<#import "macro.ftl" as macro>

<table>
    <#list rows as row>
        <@macro.tableRow row/>
    </#list>
</table>