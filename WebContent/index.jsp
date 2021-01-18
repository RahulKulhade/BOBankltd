<%@page import="com.bank.helper.ConnectionProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" type="text/css" href="css/common.css" />
        <link rel="stylesheet" type="text/css" href="css/index.css" />
        <link rel="stylesheet" type="text/css" href="css/nivo-slider.css"  media="screen" />
        <script src="jquery/jquery-1.9.0.min.js" type="text/javascript"></script>        
        <script src="jquery/jquery.nivo.slider.js" type="text/javascript"></script>
        <title>Online Banking System</title>
        <style>
        
        </style>
        <script>
            $(window).load(function()
            {
                $("#slider").nivoSlider();
            });
        </script></head>
 <body>

<div class="MainContainer">
            <div class="HeaderContainer">
                <jsp:include page="includes/header.inc.jsp" />
                <div class="MenuContainer">
                	<jsp:include page="includes/visitorMenu.inc.jsp" />
            	</div>
            <jsp:include page="includes/message.inc.jsp" />
           </div>
           <div class="MainBody">
               <div  id="home-page-displayer" class="HomePageDisplayer">
                    <div id="banners-displayer" class="BannersDisplayer" >                
                        <div class="Banner">
                            <div id="slider" class="nivoSlider">
                                <img src="images/image1.jpg" />
                                <img src="images/image2.jpg" />
                                <img src="images/image3.jpg" />
                                
                            </div>	
                        </div>
                   </div>
               </div>
           </div>
        </div><br><br>
        <div id="footer" class="Footer">
            <jsp:include page="includes/footer.inc.jsp" />
            &nbsp;
        </div>  
<!--javascript  -->

</body>
</html>