<#macro tableRow row>
    <tr>
        <#list row as col>
            <@tableCell col/>
        </#list>
    </tr>
</#macro>

<#macro tableCell cell>
    <#if cell.type == "id">
        <td class="id">
    <#elseif cell.type == "name">
        <td class="name">
    <#elseif cell.type == "amount">
        <td class="amount">
    <#else>
        <td>
    </#if>
    <@content cell/>
    </td>
</#macro>

<#macro content data>
    ${data}
</#macro>
