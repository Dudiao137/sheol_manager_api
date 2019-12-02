<!DOCTYPE html>
<html>
<title>API Document</title>

<xmp theme="cerulean" style="display:none;">
# hell manager api

## localhost:8090/

hell manager api


[**Contact the developer**](mailto:otswang@cqu.edu.cn)


**Version** v0.1



# APIs


## /v0.1/diaries/add






### POST


<a id="diaryAdd">新增日记</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>日记详情</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/DiaryVo">DiaryVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/diaries/users/{user_id}


### GET

<a id="diaryList">查询日记列表</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>user_id</th>
    <td>path</td>
    <td>yes</td>
    <td>用户id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>type</th>
    <td>query</td>
    <td>yes</td>
    <td>日记状态</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---
















## /v0.1/diaries/{diary_id}/check




### PUT

<a id="diaryCheck">审核日记</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>diary_id</th>
    <td>path</td>
    <td>yes</td>
    <td>事件id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>审核结果</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/DiaryCheckResult">DiaryCheckResult</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---














## /v0.1/diaries/{diary_id}/edit




### PUT

<a id="diaryEdit">修改日记</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>diary_id</th>
    <td>path</td>
    <td>yes</td>
    <td>事件id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>日记详情</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/DiaryVo">DiaryVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---














## /v0.1/equipments/query






### POST


<a id="query">分页查询列表</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/EquipmentQueryVo">EquipmentQueryVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/equipments/query/change


### GET

<a id="queryChange">分页查询修改记录列表</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>equip_id</th>
    <td>query</td>
    <td>yes</td>
    <td>设备id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>handler_id</th>
    <td>query</td>
    <td>yes</td>
    <td>使用者id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---
















## /v0.1/equipments/query/uses


### GET

<a id="queryUse">分页查询使用记录列表</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>equip_id</th>
    <td>query</td>
    <td>yes</td>
    <td>设备id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>handler_id</th>
    <td>query</td>
    <td>yes</td>
    <td>使用者id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---
















## /v0.1/events/add






### POST


<a id="eventAdd">新增待办</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>事件详情</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/EventVo">EventVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/events/users/{user_id}


### GET

<a id="eventList">查询待办列表</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>user_id</th>
    <td>path</td>
    <td>yes</td>
    <td>用户id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>type</th>
    <td>query</td>
    <td>yes</td>
    <td>查询类型 0 未发生 1 历史</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---
















## /v0.1/events/{event_id}/edit




### PUT

<a id="eventEdit">修改待办</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>event_id</th>
    <td>path</td>
    <td>yes</td>
    <td>事件id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>事件详情</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/EventVo">EventVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---














## /v0.1/funds/account/users/{user_id}


### GET

<a id="account">获取用户资产</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>user_id</th>
    <td>path</td>
    <td>yes</td>
    <td>用户id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---
















## /v0.1/funds/transfer/users/{user_id}/in






### POST


<a id="queryRecordIn">分页获取转入账记录列表</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>user_id</th>
    <td>path</td>
    <td>yes</td>
    <td>用户id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>查询vo</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/PageQuery">PageQuery</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/funds/transfer/users/{user_id}/out






### POST


<a id="queryRecordOut">分页获取转出账记录列表</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>user_id</th>
    <td>path</td>
    <td>yes</td>
    <td>用户id</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>查询vo</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/PageQuery">PageQuery</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/login






### POST


<a id="login">登录</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/UserLogin">UserLogin</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/login/mobile






### POST


<a id="loginByMobile">用手机号登录</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/MobileLoginInfo">MobileLoginInfo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/logs/action/query






### POST


<a id="actionLogQuery">操作日志查询</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>查询条件</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/LogQueryVo">LogQueryVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/logs/login/query






### POST


<a id="loginLogQuery">登录日志查询</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>查询条件</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/LogQueryVo">LogQueryVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/orders/add






### POST


<a id="add">新增</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/OrderVo">OrderVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/orders/edit




### PUT

<a id="edit">编辑</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/OrderVo">OrderVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---














## /v0.1/orders/query






### POST


<a id="query">分页查询列表</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/OrderQueryVo">OrderQueryVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/password/reset






### POST


<a id="resetPassw">重置密码</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/PasswordResetInfo">PasswordResetInfo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/products/delete








### DELETE

<a id="delete">删除</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    Array[<a href=""></a>]
    
    </td>

</tr>

<tr>
    <th></th>
    <td>query</td>
    <td>yes</td>
    <td>验证码，当批量删除需要</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th></th>
    <td>query</td>
    <td>yes</td>
    <td>验证id，与验证码一一对应</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---










## /v0.1/products/edit




### PUT

<a id="edit">编辑</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/ProductVo">ProductVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---














## /v0.1/products/query






### POST


<a id="query">查询列表</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/ProductQueryVo">ProductQueryVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/register






### POST


<a id="register">用户注册</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/UserRegisterInfo">UserRegisterInfo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/security/permissions/add






### POST


<a id="addPermission">新增权限</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>权限Vo</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/PermissionVo">PermissionVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/security/permissions/delete








### DELETE

<a id="deletePermission">删除权限列表, 删除顶级权限会递增删除子权限</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>权限ID列表</td>
    <td> - </td>

    <td>
    Array[<a href=""></a>]
    
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---










## /v0.1/security/permissions/parents


### GET

<a id="getAllParentPermissions">获取所有顶级权限列表</a>









#### Request



##### Parameters






#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---
















## /v0.1/security/permissions/parents/{parent_id}


### GET

<a id="getAllParentPermissions">获取权限列表</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>parent_id</th>
    <td>path</td>
    <td>yes</td>
    <td>父类id</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---
















## /v0.1/security/roles


### GET

<a id="getAllRoles">获取所有角色列表</a>









#### Request



##### Parameters






#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---
















## /v0.1/security/roles/add






### POST


<a id="addRole">新增角色</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>角色Vo</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/RoleVo">RoleVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/security/roles/delete








### DELETE

<a id="deleteRole">删除角色列表</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>角色ID列表</td>
    <td> - </td>

    <td>
    Array[<a href=""></a>]
    
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---










## /v0.1/security/roles/permissions/bind






### POST


<a id="bindRolePermission">更新角色权限绑定关系</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>角色权限绑定关系</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/RelationUserRoleVo">RelationUserRoleVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/security/users/roles/bind






### POST


<a id="bindUserRole">更新用户角色绑定关系</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td>用户角色绑定关系</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/RelationRolePermissionVo">RelationRolePermissionVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---












## /v0.1/sms/code


### GET

<a id="getSmsCode">获取验证码</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/CheckVo">CheckVo</a> 
    </td>

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/Result">Result</a>|


---

















# Definitions

## <a name="/definitions/CheckVo">CheckVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>checkType</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>验证码类型 0 登录， 1 重置， 2 批量删除</td>
            <td></td>
        </tr>
    
        <tr>
            <td>checkId</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>获取验证码时的id，与code一一对应</td>
            <td></td>
        </tr>
    
        <tr>
            <td>checkCode</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>验证码</td>
            <td></td>
        </tr>
    
        <tr>
            <td>mobile</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>手机号</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/DiaryCheckResult">DiaryCheckResult</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>result</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>审核结果 up / down</td>
            <td></td>
        </tr>
    
        <tr>
            <td>remark</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>备注</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/DiaryVo">DiaryVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>userId</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>用户id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>title</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>日记标题</td>
            <td></td>
        </tr>
    
        <tr>
            <td>brief</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>简介</td>
            <td></td>
        </tr>
    
        <tr>
            <td>body</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>日记内容</td>
            <td></td>
        </tr>
    
        <tr>
            <td>status</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>状态</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/EquipmentQueryVo">EquipmentQueryVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>pageNo</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>请求页码</td>
            <td></td>
        </tr>
    
        <tr>
            <td>pageSize</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>分页大小</td>
            <td></td>
        </tr>
    
        <tr>
            <td>orderColumn</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>排序字段</td>
            <td></td>
        </tr>
    
        <tr>
            <td>orderType</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>排序方式 desc 倒序，默认正序</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/EventVo">EventVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>userId</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>创建者id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>title</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>待办标题</td>
            <td></td>
        </tr>
    
        <tr>
            <td>body</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>待办事项</td>
            <td></td>
        </tr>
    
        <tr>
            <td>remark</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>备注</td>
            <td></td>
        </tr>
    
        <tr>
            <td>partner_ids</td>
            <td>
                
                
                array[integer]
                
            </td>
            <td>optional</td>
            <td>相关人列表</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/LogQueryVo">LogQueryVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>pageNo</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>请求页码</td>
            <td></td>
        </tr>
    
        <tr>
            <td>pageSize</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>分页大小</td>
            <td></td>
        </tr>
    
        <tr>
            <td>orderColumn</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>排序字段</td>
            <td></td>
        </tr>
    
        <tr>
            <td>orderType</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>排序方式 desc 倒序，默认正序</td>
            <td></td>
        </tr>
    
        <tr>
            <td>userIds</td>
            <td>
                
                
                array[integer]
                
            </td>
            <td>optional</td>
            <td>查询用户id</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/MobileLoginInfo">MobileLoginInfo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>mobile</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>用户手机号</td>
            <td></td>
        </tr>
    
        <tr>
            <td>code</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>验证码</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/OrderQueryVo">OrderQueryVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>pageNo</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>请求页码</td>
            <td></td>
        </tr>
    
        <tr>
            <td>pageSize</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>分页大小</td>
            <td></td>
        </tr>
    
        <tr>
            <td>orderColumn</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>排序字段</td>
            <td></td>
        </tr>
    
        <tr>
            <td>orderType</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>排序方式 desc 倒序，默认正序</td>
            <td></td>
        </tr>
    
        <tr>
            <td>productId</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>产品id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>handlerId</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>操作员id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>status</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>状态</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/OrderVo">OrderVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>productUpId</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>商品id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>productDownId</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>商品id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>handlerId</td>
            <td>
                
                
                array[integer]
                
            </td>
            <td>optional</td>
            <td>操作员id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>status</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>商品状态</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/PageQuery">PageQuery</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>pageNo</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>请求页码</td>
            <td></td>
        </tr>
    
        <tr>
            <td>pageSize</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>分页大小</td>
            <td></td>
        </tr>
    
        <tr>
            <td>orderColumn</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>排序字段</td>
            <td></td>
        </tr>
    
        <tr>
            <td>orderType</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>排序方式 desc 倒序，默认正序</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/PasswordResetInfo">PasswordResetInfo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>用户名</td>
            <td></td>
        </tr>
    
        <tr>
            <td>mobile</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>手机号</td>
            <td></td>
        </tr>
    
        <tr>
            <td>code</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>验证码</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/PermissionVo">PermissionVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>id</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>权限名称</td>
            <td></td>
        </tr>
    
        <tr>
            <td>parentId</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>父权限id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>parentName</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>父权限名称</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/ProductQueryVo">ProductQueryVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>pageNo</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>请求页码</td>
            <td></td>
        </tr>
    
        <tr>
            <td>pageSize</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>分页大小</td>
            <td></td>
        </tr>
    
        <tr>
            <td>orderColumn</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>排序字段</td>
            <td></td>
        </tr>
    
        <tr>
            <td>orderType</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>排序方式 desc 倒序，默认正序</td>
            <td></td>
        </tr>
    
        <tr>
            <td>status</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>状态</td>
            <td></td>
        </tr>
    
        <tr>
            <td>category</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>类目</td>
            <td></td>
        </tr>
    
        <tr>
            <td>deadType</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>死亡方式</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/ProductVo">ProductVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
</table>

## <a name="/definitions/RelationRolePermissionVo">RelationRolePermissionVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>roleId</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>required</td>
            <td>用户id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>permissionIds</td>
            <td>
                
                
                array[integer]
                
            </td>
            <td>optional</td>
            <td>角色列表，可为空</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/RelationUserRoleVo">RelationUserRoleVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>userId</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>required</td>
            <td>用户id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>roleIds</td>
            <td>
                
                
                array[integer]
                
            </td>
            <td>optional</td>
            <td>角色列表，可为空</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/Result">Result</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>code</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>message</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>data</td>
            <td>
                
                    
                    object
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/RoleVo">RoleVo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>id</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>id</td>
            <td></td>
        </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>角色名称</td>
            <td></td>
        </tr>
    
        <tr>
            <td>code</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>角色标识</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/UserLogin">UserLogin</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>userName</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>用户名</td>
            <td></td>
        </tr>
    
        <tr>
            <td>password</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>用户密码</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/UserRegisterInfo">UserRegisterInfo</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>用户名</td>
            <td></td>
        </tr>
    
        <tr>
            <td>mobile</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>手机号</td>
            <td></td>
        </tr>
    
        <tr>
            <td>avatar</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>头像url</td>
            <td></td>
        </tr>
    
        <tr>
            <td>password</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>密码</td>
            <td></td>
        </tr>
    
</table>



</xmp>

<script src="http://strapdownjs.com/v/0.2/strapdown.js"></script>
</html>