# Back End - Java
Restful API Using JAVA


## Get Authorization with axios

```
var api_key = process.env.API_KEY;

export const loginHandler = (u,p) => dispatch => {
    axios
      .post(`http://thewebbranch.com/oauth/token`, `grant_type=password&username=${u}&password=${p}`,{
        headers:{
          'Authorization':`Basic ${api_key}`,
          'Content-Type': 'application/x-www-form-urlencoded'
        }
      })
      .then(res=> dispatch({ type: LOGIN, payload:res }))
      .catch(err => dispatch({type:LOGIN_FAIL,payload:err}))  
  }
```

# Role

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** |  | [optional] [default to null]
**roleid** | **integer** |  | [optional] [default to null]
**userRoles** | [**array[UserRoles]**](UserRoles.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


