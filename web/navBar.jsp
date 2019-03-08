<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/css?family=Didact+Gothic|Sacramento" rel="stylesheet">


        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

        <link rel="stylesheet" href="cssmenu/font-awesome.min.css"/>
        <link rel="stylesheet" href="cssmenu/flaticon.css"/>
        <link rel="stylesheet" href="cssmenu/owl.carousel.css"/>
        <link rel="stylesheet" href="cssmenu/style.css"/>
        <link rel="stylesheet" href="cssmenu/animate.css"/>   
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css" />
        <link rel="stylesheet" href="style_gallery.css">
        <title>Restorancic</title>

        <style>
            /* Stackoverflow preview fix, please ignore */
            body{
                background-color: #fcf2ff !important;    

            }
            .navbar{background-color: #770796 !important;
                    opacity: 0.7;}
            .navbar:hover {
                opacity: 1.0;

            }

            .navbar-nav {
                flex-direction: row;
            }
            .navbar-brand{
                color: white !important;
            }
            .nav-link {
                color: white !important;
                padding-right: .5rem !important;
                padding-left: .5rem !important;
            }

            /* Fixes dropdown menus placed on the right side */
            .ml-auto .dropdown-menu {
                left: auto !important;
                right: 0px;
            }
            .Onama{

                margin-top: 100px;
            }
            #prvi{
                float: left;
                padding: 40px;
            }
            .idP{

                padding: 130px;
                font-family: 'Didact Gothic', sans-serif;
                font-size: 1em;
            }
            #cistac{
                clear: both;
            }
            .colourLocation{
                background-color: #fcf2ff;
                padding:20px 0;

            }
            .card{border:0 !important;}


        </style>
    </head>
    <body>
        <!--      Navigation-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Pocetna<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#AboutUs">O nama<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item text-dark"> 
                        <a  href="#myModa2" data-toggle = "modal" data-target= "#myModal2" class="nav-link">
                            Rezervacije</a>



                    </li>
                    <li class="nav-item">
                        <a href="#myModal" data-toggle = "modal" data-target= "#myModal" class="nav-link">Porudzbine</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#gallery">Galerija</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#menu">Meni</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#contact">Kontakt</a>
                    </li> </ul>

                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a href="#myModal3" data-toggle = "modal" data-target= "#myModal3" class="nav-link" >Registruj se</a>
                        <!--<a class="nav-link" href="#" >Registruj se</a>-->
                    </li>
                    <li class="nav-item">
                        <a  href="#myModal4" data-toggle = "modal" data-target= "#myModal4" class="nav-link">Prijavi se </a>
                        <!--<a class="nav-link" href="#">Prijavi se </a>-->
                    </li></ul>
                <!--      <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                          Dropdown link
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                      </li>-->

            </div>
        </nav>
        <!--Carusel Tanja-->



        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="slike/1.jpg" class="d-block w-100" alt="slika 1">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 style="font-family: 'Didact Gothic', sans-serif;font-size: 5em; color: cornsilk; text-align:left; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">Restoran</h5>
                        <p style="font-family: 'Sacramento', cursive; font-size: 3em; color: cornsilk; text-align:left; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">Jednom kad dođete, uvek ćete se vraćati!</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="slike/2.jpg" class="d-block w-100" alt="slika 2">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 style="font-family: 'Didact Gothic', sans-serif;font-size: 5em; color: cornsilk; text-align:left; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">Restoran</h5>
                        <p style="font-family: 'Sacramento', cursive; font-size: 3em; color: cornsilk; text-align:left; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">Uživajte u čaroliji ukusa!</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="slike/3.jpg" class="d-block w-100" alt="slika 3">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 style="font-family: 'Didact Gothic', sans-serif;font-size: 5em; color: cornsilk; text-align:left; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">Restoran</h5>
                        <p style="font-family: 'Sacramento', cursive; font-size: 3em; color: cornsilk; text-align:left; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">Samo najbolje iz naše kuhinje za vas!</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="slike/4.jpg" class="d-block w-100" alt="slika 4">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 style="font-family: 'Didact Gothic', sans-serif;font-size: 5em; color: cornsilk; text-align:left; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">Restoran</h5>
                        <p style="font-family: 'Sacramento', cursive; font-size: 3em; color: cornsilk; text-align:left; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">Uživajte u čaroliji ukusa!</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="slike/5.jpg" class="d-block w-100" alt="slika 5">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 style="font-family: 'Didact Gothic', sans-serif;font-size: 5em; color: cornsilk; text-align:left; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">Restoran</h5>
                        <p style="font-family: 'Sacramento', cursive; font-size: 3em; color: cornsilk; text-align:left; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">Samo najbolje iz naše kuhinje za vas!</p>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

        <!-- About us VLADA-->



        <section id="AboutUs">        
            <div class="container Onama">
                <div class="section-title">
                    <i class="flaticon-022-tray"></i>
                    <h2>O NAMA</h2>
                </div>

                <div id="prvi"> 

                    <img  src="slike/Slicica.jpg" class="img-fluid" alt="food" width="500px">
                </div>

                <div class="idP">

                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus velit sapien,
                        mollis id risus in, tempor varius lorem. Mauris ut molestie arcu. Morbi tincidunt
                        justo vel libero rutrum varius. Suspendisse potenti. Aenean tempus, orci sit amet 
                        efficitur fringilla, dolor dolor dignissim dui, at tristique velit ligula eu libero.
                        Donec pretium, tortor eget luctus ultricies
                    </p>
                    <p><i>Samo najbolje iz nase kuhinje za vas!</i></p>
                </div>
                <div id="cistac"></div>

            </div>
        </section>


        <div class="modal fade" id="myModal">
            <div class="modal-dialog">
                <div class="modal-content"> 
                    <div class="modal-header">
                        <h5 class="modal-title">For your Queries</h5> 
                    </div>
                    <div class="modal-body">
                        IF you have any questions, Mess Manager Office number is <strong>+01234567890</strong> or you can email us by <strong>Ouremail@domain.com</strong>>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-dismiss = "modal">Close</button>
                    </div>
                </div>
            </div>
        </div>

        <!--        
                GALLERY- Rujana-->




        <section id="gallery" class="gallery-block compact-gallery">

            <div class="container">
                <div class="section-title">
                    <i class="flaticon-022-tray"></i>
                    <h2>GALERIJA</h2>
                </div>

                <div class="row no-gutters">
                    <div class="col-md-6 col-lg-4 item zoom-on-hover">
                        <a class="lightbox" href="img/img1.jpg">
                            <img class="img-fluid image" src="img/img1.jpg">
                            <span class="description">
                                <span class="description-heading">Lorem Ipsum</span>
                                <span class="description-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam urna.Lorem ipsum dolor sit amet, consectetur adipiscing elit.</span>
                            </span>
                        </a>
                    </div>


                    <div class="col-md-6 col-lg-4 item zoom-on-hover">
                        <a class="lightbox" href="img/img2.jpg">
                            <img class="img-fluid image" src="img/img2.jpg">
                            <span class="description">
                                <span class="description-heading">Lorem Ipsum</span>
                                <span class="description-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam urna.Lorem ipsum dolor sit amet, consectetur adipiscing elit.</span>
                            </span>
                        </a>
                    </div>


                    <div class="col-md-6 col-lg-4 item zoom-on-hover">
                        <a class="lightbox" href="img/img3.jpg">
                            <img class="img-fluid image" src="img/img3.jpg">
                            <span class="description">
                                <span class="description-heading">Lorem Ipsum</span>
                                <span class="description-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam urna.Lorem ipsum dolor sit amet, consectetur adipiscing elit.</span>
                            </span>
                        </a>
                    </div>

                    <div class="col-md-6 col-lg-4 item zoom-on-hover">
                        <a class="lightbox" href="img/img4.jpg">
                            <img class="img-fluid image" src="img/img4.jpg">
                            <span class="description">
                                <span class="description-heading">Lorem Ipsum</span>
                                <span class="description-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam urna.Lorem ipsum dolor sit amet, consectetur adipiscing elit.</span>
                            </span>
                        </a>
                    </div>


                    <div class="col-md-6 col-lg-4 item zoom-on-hover">
                        <a class="lightbox" href="img/img5.jpg">
                            <img class="img-fluid image" src="img/img5.jpg">
                            <span class="description">
                                <span class="description-heading">Lorem Ipsum</span>
                                <span class="description-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam urna.Lorem ipsum dolor sit amet, consectetur adipiscing elit.</span>
                            </span>
                        </a>
                    </div>


                    <div class="col-md-6 col-lg-4 item zoom-on-hover">
                        <a class="lightbox" href="img/img6.jpg">
                            <img class="img-fluid image" src="img/img6.jpg">
                            <span class="description">
                                <span class="description-heading">Lorem Ipsum</span>
                                <span class="description-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam urna.Lorem ipsum dolor sit amet, consectetur adipiscing elit.</span>
                            </span>
                        </a>
                    </div>

                    <div class="col-md-6 col-lg-4 item zoom-on-hover">
                        <a class="lightbox" href="img/img7.jpg">
                            <img class="img-fluid image" src="img/img7.jpg">
                            <span class="description">
                                <span class="description-heading">Lorem Ipsum</span>
                                <span class="description-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam urna.Lorem ipsum dolor sit amet, consectetur adipiscing elit.</span>
                            </span>
                        </a>
                    </div>

                    <div class="col-md-6 col-lg-4 item zoom-on-hover">
                        <a class="lightbox" href="img/img8.jpg">
                            <img class="img-fluid image" src="img/img8.jpg">
                            <span class="description">
                                <span class="description-heading">Lorem Ipsum</span>
                                <span class="description-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam urna.Lorem ipsum dolor sit amet, consectetur adipiscing elit.</span>
                            </span>
                        </a>
                    </div>

                    <div class="col-md-6 col-lg-4 item zoom-on-hover">
                        <a class="lightbox" href="img/img9.jpg">
                            <img class="img-fluid image" src="img/img9.jpg">
                            <span class="description">
                                <span class="description-heading">Lorem Ipsum</span>
                                <span class="description-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam urna.Lorem ipsum dolor sit amet, consectetur adipiscing elit.</span>
                            </span>
                        </a>
                    </div>

                </div>
            </div>
        </section>

        <!--      MENI- Bozidar-->




        <!-- Menu section -->
        <section id="menu" class="mp-menu-section spad">
            <div class="container">
                <div class="section-title">
                    <i class="flaticon-022-tray"></i>
                    <h2>MENI</h2>
                </div>
                <ul class="mp-menu-tab-nav nav nav-tabs" role="tablist">
                    <li class="nav-item">
                        <a class="nav-link active" data-toggle="tab" href="#tab-1" role="tab" aria-controls="tab-1" aria-selected="true">
                            <i class="flaticon-005-coffee-1"></i>
                            <div class="mpm-text">
                                <h5>Breakfast</h5>
                                <p>Weekdays? 8:30a.m. — 11:30a.m.</p>
                            </div>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="tab" href="#tab-2" role="tab" aria-controls="tab-2" aria-selected="false">
                            <i class="flaticon-013-salad"></i>
                            <div class="mpm-text">
                                <h5>Lunch</h5>
                                <p>Weekdays? 11:30a.m. — 15:30a.m.</p>
                            </div>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="tab" href="#tab-3" role="tab" aria-controls="tab-3" aria-selected="false">
                            <i class="flaticon-008-soup"></i>
                            <div class="mpm-text">
                                <h5>Dinner</h5>
                                <p>Weekdays? 16:30a.m. — 22:30a.m.</p>
                            </div>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="tab" href="#tab-4" role="tab" aria-controls="tab-4" aria-selected="false">
                            <i class="flaticon-018-lobster"></i>
                            <div class="mpm-text">
                                <h5>Drinks Menu</h5>
                                <p>All day</p>
                                <p>every day</p>
                            </div>
                        </a>
                    </li>
                </ul>

                <div class="tab-content menu-tab-content">
                    <!-- single tab content -->
                    <div class="tab-pane fade show active" id="tab-1" role="tabpanel" aria-labelledby="tab-1">
                        <div class="row menu-dark">
                            <div class="col-lg-6">
                                <!-- menu item -->
                                <c:forEach items="${requestScope.dorucak}" var="jelo">
                                    <div class="menu-item">
                                        <h5>${jelo.nazivJela}</h5>
                                        <div class="mi-meta">
                                            <p>${jelo.opisJela}</p>
                                            <div class="menu-price">${jelo.cena}</div>
                                        </div>
                                    </div>
                                </c:forEach>



                            </div>
                        </div>
                    </div>
                    <!-- single tab content -->
                    <div class="tab-pane fade" id="tab-2" role="tabpanel" aria-labelledby="tab-2">
                        <div class="row menu-dark">
                            <div class="col-lg-6">
                                <!-- menu item -->
                                <c:forEach items="${requestScope.rucak}" var="jelo">
                                    <div class="menu-item">
                                        <h5>${jelo.nazivJela}</h5>
                                        <div class="mi-meta">
                                            <p>${jelo.opisJela}</p>
                                            <div class="menu-price">${jelo.cena}</div>
                                        </div>
                                    </div>
                                </c:forEach>



                                <!-- <div class="col-lg-6">-->




                            </div>
                        </div>
                    </div>
                    <!-- single tab content -->
                    <div class="tab-pane fade" id="tab-3" role="tabpanel" aria-labelledby="tab-3">
                        <div class="row menu-dark">
                            <div class="col-lg-6">
                                <!-- menu item -->
                                <c:forEach items="${requestScope.vecera}" var="jelo">
                                    <div class="menu-item">
                                        <h5>${jelo.nazivJela}</h5>
                                        <div class="mi-meta">
                                            <p>${jelo.opisJela}</p>
                                            <div class="menu-price">${jelo.cena}</div>
                                        </div>
                                    </div>
                                </c:forEach>


                            </div>
                            <!-- <div class="col-lg-6">-->







                        </div>
                    </div>
                    <!-- single tab content -->
                    <div class="tab-pane fade" id="tab-4" role="tabpanel" aria-labelledby="tab-4">
                        <div class="row menu-dark">
                            <div class="col-lg-6">
                                <c:forEach items="${requestScope.pice}" var="jelo">
                                    <div class="menu-item">
                                        <h5>${jelo.nazivJela}</h5>
                                        <div class="mi-meta">
                                            <p>${jelo.opisJela}</p>
                                            <div class="menu-price">${jelo.cena}</div>
                                        </div>
                                    </div>
                                </c:forEach>


                                <!--   <div class="col-lg-6">
                                      menu item -->




                            </div>
                        </div>
                    </div>
                </div>
        </section>

        <!-- Featured sectoon -->
        <section class="featured-section set-bg" data-setbg="img/featured-bg.jpg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 offset-lg-6 featured">
                        <div class="section-title st-no-style text-left">
                            <i class="flaticon-022-tray"></i>
                            <h2 class="p-0">Preporuka kuvara</h2>
                        </div>
                        <div class="menu-dark">
                            <div class="menu-item">
                                <h5>${jeloDana.nazivJela}</h5>
                                <div class="mi-meta">
                                    <p>${jeloDana.opisJela}</p>
                                    <div class="menu-price">${jeloDana.cena}</div>
                                </div>
                            </div>
                        </div>
                        <p class="pb-3">Piletina u bešamel sosu, sa mlevenom paprikom, belim lukom i zacinima, karfiolom i preliveno otopljenim plavim sirom</p>


                    </div>
                </div>
            </div>
        </section>
        <!-- Featured sectoon end -->



        <!-- MARKO LOKACIJA-->

        <section id="contact">
            <div class="container">
                <div class="card colourLocation">
                    <div class="section-title">
                        <i class="flaticon-022-tray"></i>
                        <h2>KONTAKTIRAJTE NAS</h2>
                    </div>

                </div>

                <div class="row">
                    <div class="col-md-7">
                        <iframe src="https://maps.google.com/maps?q=omladinskih%20brigada%2086&t=&z=13&ie=UTF8&iwloc=&output=embed" width="100%" height="315" frameborder="0" style="border:0" allowfullscreen></iframe>
                    </div>

                    <div class="col-md-5">

                        <form>
                            <div class="form-group">
                                <input type="text" class="form-control" name="imeKontakta" value="" placeholder="Ime">
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control" name="emailKontakta" value="" placeholder="E-mail">
                            </div>
                            <div class="form-group">
                                <input type="tel" class="form-control" name="telefonKontakta" value="" placeholder="Telefon">
                            </div>
                            <div class="form-group">
                                <textarea class="form-control" name="poruka" rows="3" placeholder="Poruka"></textarea>
                            </div>
                            <button class="btn btn-light" type="submit" name="button">
                                Potvrdi
                            </button>
                        </form>
                    </div>

                </div>
                <br>
                <div class="card bg-light">
                    <p>    <b> Nalazimo se u</b>: Beogradu, ulica Omladinskih brigada 86.  <b> telefon:</b> 065/2665451 <b>   radno vreme:</b>  Ponedeljak - Subota: od 9h do 23h</p>
                </div>
            </div>





            <!--Rezervacije VERA-->
            <div class="modal fade" id="myModal2">
                <div class="modal-dialog">
                    <div class="modal-content"> 
                        <div class="modal-header">
                            <h5 class="modal-title">Rezervacije</h5> 
                        </div>
                        <div class="modal-body">    
                            <div class="container">  
                                <form>
                                    <!--  <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputIme4">Ime</label>
                                          <input type="ime" class="form-control" id="inputIme4" placeholder="Ime">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputPrezime4">Prezime</label>
                                          <input type="prezime" class="form-control" id="inputPrezime4" placeholder="Prezime">
                                        </div>
                                      </div>-->

                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                            <label for="inputBrojTelefona4">Broj Telefona</label>
                                            <input type="brojtelefona" class="form-control" id="inputBrojTelefona4" placeholder="Broj Telefona">
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label for="inputEmail4">Email</label>
                                            <input type="Email" class="form-control"  placeholder="Email">
                                        </div>
                                    </div>

                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                            <label for="inputTipRezervacije">Tip Rezervacije</label>
                                            <div>
                                                <div class="form-check-inline">
                                                    <label class="form-check-label">
                                                        <input type="radio" class="form-check-input" name="optradio">Vecera
                                                    </label>
                                                </div>

                                                <div class="form-check-inline">
                                                    <label class="form-check-label">
                                                        <input type="radio" class="form-check-input" name="optradio">Pice
                                                    </label>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group col-md-6">
                                            <label for="inputBrojGostiju">Broj Gostiju</label>
                                            <select id="inputBrojGostiju" class="form-control">
                                                <option selected>Izaberi</option>
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                            <label for="inputDatum4">Datum</label>
                                            <input type="date" class="form-control" id="inputDatum4" placeholder="Datum">
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label for="inputVremeRezervacije">Vreme Rezervacije</label>
                                            <select id="inputVremeRezervacije" class="form-control">
                                                <option selected>Izaberi</option>
                                                <option>19:30</option>
                                                <option>20:00</option>
                                                <option>20:30</option>
                                                <option>21:00</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-row">
                                        <div class="form-group col-md-12">
                                            <label for="inputKomentar4">Komentar</label>
                                            <textarea class="form-control" rows="5" id="komentar"></textarea>

                                        </div>

                                    </div>

                                    <button type="submit" class="btn btn-secondary">Rezervisi</button>
                                </form>


                            </div>
                        </div>

                    </div>
                </div>
            </div>



            <!--            NENAD MILOJEVIC REGISTRACIJA-->
            <div class="modal left fade" id="myModal3">
                <div class="modal-dialog">
                    <div class="modal-content"> 
                        <div class="modal-header">
                            <h5 class="modal-title">Registruj se</h5> 
                        </div>
                        <div class="modal-body">
                            <div class="container"><form action="${pageContext.request.contextPath}/RegistracijaServlet" method="POST">
                                    <div class="form-float">
                                       <div class="form-group col-md-12">
                                          <label for="inputIme4">Ime</label>
                                          <input type="ime" class="form-control" id="inputIme4" name="ime" placeholder="Ime">
                                        </div>
                                        <div class="form-group col-md-12">
                                          <label for="inputPrezime4">Prezime</label>
                                          <input type="prezime" class="form-control" id="inputPrezime4" name="prezime" placeholder="Prezime">
                                        </div>
                                        
                                        <div class="form-group col-md-12">
                                            <label for="inputEmail4">Email</label>
                                            <input type="email" class="form-control" id="inputEmail4" name="email" placeholder="Vas Email">
                                        </div>
                                        <div class="form-group col-md-12">
                                            <label for="inputPassword4">Lozinka</label>
                                            <input type="password" class="form-control" id="inputPassword4" name="lozinka" placeholder="Vasa lozinka">
                                        </div>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <label for="inputAddress">Adresa</label>
                                        <input type="text" class="form-control" id="inputAddress" name="adresa" placeholder="Vitanovacka 67 stan 12">
                                    </div>
                                    <div class="form-group col-md-12">
                                        <label for="inputAddress">Telefon</label>
                                        <input type="text" class="form-control" id="inputAddress" name="telefon" placeholder="011/2323444">
                                    </div>
                                    <div class="form-row col-md-12">

                                        <label for="inputCity">Grad</label>
                                        <input type="text" class="form-control" id="inputCity" name="grad" placeholder="Beograd...">

                                    </div>
                                    <div class="form-row col-md-12">

                                        <div class="form-group col-md-6">
                                            <button type="submit" class="btn btn-secondary col-md-6 mt-4">Kreiraj</button>
                                        </div>
                                    </div>
                                </form>


                            </div>

                        </div>
                    </div>
                </div>
            </div>

            <!-- login TRAJKO PESIC-->




            <div class="modal left fade" id="myModal4">
                <div class="modal-dialog">
                    <div class="modal-content"> 
                        <div class="modal-header">
                            <h5 class="modal-title">Prijavi se</h5> 
                        </div>
                        <div class="modal-body">
                            <div class="container">
                                <form>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Email</label>
                                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Unesi email">
                                        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-secondary">Potvrdi</button>
                                    </div>
                                </form>

                            </div>

                        </div>
                    </div>
                </div>
            </div>

            <!-- Optional JavaScript -->
            <!-- jQuery first, then Popper.js, then Bootstrap JS -->



            <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

            <script src="jsmenu/owl.carousel.min.js"></script>
            <script src="jsmenu/circle-progress.min.js"></script>
            <script src="jsmenu/main.js"></script>

            <script src="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js"></script>
            <script>
                baguetteBox.run('.compact-gallery', {animation: 'slideIn'});
            </script>
    </body>
</html>