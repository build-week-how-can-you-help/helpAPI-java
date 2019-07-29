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

