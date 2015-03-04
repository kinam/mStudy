<%@ page contentType="text/html;charset=utf-8" %>
<!doctype html>
<head>
<script>
</script>
<style>
table tr td {height:30px; padding:10px;}
</style>
</head>
<body>
<h2>Hello World!</h2>
<table width="500" border="1" >
    <tbody>
    <colgroup>
        <col width="20%">
        <cos width="*">
    </colgroup>
    <tr>
        <th>사용자ID</th>
        <td>${userInfo.USER_ID}</td>
    </tr>
    <tr>
        <th>사용자명</th>
        <td>${userInfo.USER_NAME}</td>
    </tr>
    </tbody>
</table>
</body>
</html>