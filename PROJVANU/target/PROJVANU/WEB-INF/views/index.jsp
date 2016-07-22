<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,.carousel-inner > .item > a > img 
  {
      width: 70%;
      margin: auto;
  }
  </style>
</head>
<body bgcolor=silver>
<div class="header">
  <nav class="navbar navbar-default">
  <div class="container-fluid">
        <div align="right" class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="color:#0000FF;background:#EEEEEE;display:block">

         <img src="E:\eclipse workspace\VinayNiitVja\src\main\webapp\Images\5.jpg"  width=100 height=100 align=left> 
      <ul class="nav navbar-nav navbar-right">
           <li><a href="index">Home</a></li>
            <li><a href="Products">Products</a></li>
            <li><a href="uploadFile">Upload</a></li>
            <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Login
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="login">Admin</a></li>
          <li><a href="login">Customer</a></li>
         
        </ul>
      </li>
            <li><a href="customer">Register</a></li>
            <li><a href="AddProduct">AddProduct</a></li>
          
           
            
      </ul>
    </div>
  </div>
</nav>
</div>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="E:\eclipse workspace\VinayNiitVja\src\main\webapp\Images\1.png" alt="Chania">
    </div>

    <div class="item">
      <img src="E:\eclipse workspace\VinayNiitVja\src\main\webapp\Images\2.jpg" alt="Chania">
    </div>

    <div class="item">
      <img src="E:\eclipse workspace\VinayNiitVja\src\main\webapp\Images\3.jpg" alt="Flower">
    </div>

    <div class="item">
      <img src="E:\eclipse workspace\VinayNiitVja\src\main\webapp\Images\4.jpg" alt="Flower">
    </div>
  </div>

<!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
  
</div>

<nav class="navbar navbar-inverse navbar-fixed-bottom">
  <div class="container-fluid">
    <div class="navbar-header">
      
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">About US</a></li>
        <li class="active"><a href="#">CONTACT</a></li>
        </ul>
            <ul class="nav navbar-nav navbar-right">
       
      <li><a onclick="" class="btn btn-social-icon btn-lg btn-facebook"><i class="fa fa-facebook"></i></a></li>
      <li><<a onclick="" class="btn btn-social-icon btn-lg btn-dropbox"><i class="fa fa-dropbox"></i></a></li>
      <li> <a onclick="" class="btn btn-social-icon btn-lg btn-flickr"><i class="fa fa-flickr"></i></a></li>
    </ul>
  </div>
</nav>
</body>
</html>


