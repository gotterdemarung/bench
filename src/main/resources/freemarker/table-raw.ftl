<table>
    <#list rows as row>
        <tr>
            <#list row as cell>
                <#if cell.type == "id">
                    <td class="id">
                <#elseif cell.type == "name">
                    <td class="name">
                <#elseif cell.type == "amount">
                    <td class="amount">
                <#else>
                    <td>
                </#if>
                ${cell}
                </td>
            </#list>
        </tr>
    </#list>
</table>