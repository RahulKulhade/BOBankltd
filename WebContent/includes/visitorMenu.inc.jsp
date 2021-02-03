<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.servletContext.contextPath }"></c:set>
<div id="menu">
    <ul>
         <li><a href="${path }/index.jsp">Home</a></li>
         <li><a href="${path }/jsp/forms.jsp">Forms</a></li>	
	     <li><a href="${path }/jsp/locator.jsp">ATM Locators</a></li>				
	     <li><a href="${path }/jsp/login.jsp">Branch Login</a></li>
	     <li><a href="${path }/jsp/loginuser.jsp">Customer login</a></li>
	     <li><a href="${path }/jsp/services.jsp">Services</a></li>
	     <li><a href="${path }/jsp/aboutUs.jsp">About Us</a></li>                
	</ul>
</div>