package id.nexcloud.nexsurvey.security.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import id.nexcloud.nexsurvey.security.encryptDecrypt.encdecKey;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.filter.OncePerRequestFilter;

public class filterToken extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		try {
			System.out.println("filterToken");
			String token = encdecKey.dencrypt(request.getHeader("TOKEN"));
			System.out.println(token);
			if (!token.equals("nexsoft")) {
				throw new RuntimeException("TOKEN TIDAK VALID");
			}
			filterChain.doFilter(request, response);
		} catch (RuntimeException e) {
			System.out.println("filterToken error");
			
			response.setStatus(HttpStatus.BAD_REQUEST.value());
			response.setContentType(MediaType.APPLICATION_JSON_VALUE);
			response.getWriter().append("TOKEN TIDAK VALID");
			// TODO: handle exception
		}
		// TODO Auto-generated method stub

	}

}
