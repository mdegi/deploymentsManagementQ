package mt.com.go.interceptors;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Priority(2020)
public class AuthorityInterceptor {

    @AroundInvoke
    Object logInvocation(InvocationContext context) {
        Object o = null;
        try {
            o = context.proceed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;

    }
}
