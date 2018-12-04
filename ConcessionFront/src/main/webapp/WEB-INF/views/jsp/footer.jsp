

<footer class="page-footer font-small blue fixed-bottom" style="border-top: 1px solid black">

<div class="container">
  <h3 class="text-center">Contact</h3>
  <p><span class="glyphicon glyphicon-map-marker"></span>Les Pennes-Mirabeau</p>
      <p><span class="glyphicon glyphicon-phone"></span>Téléphone: 00 00 00 00 00</p>
      <p><span class="glyphicon glyphicon-envelope"></span>Email: mail@mail.com</p>
  <div class="row test">
    <div class="col-md-4">
       <div id="googleMap" style="width:100%;height:200px;"></div>
 
        
    </div>
    <div class="col-md-8">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
      <div class="row">
        <div class="col-md-12 form-group">

          <button class="btn pull-right" type="submit">Send</button>
        </div>
      </div> 
    </div>
  </div>
</div>
  
  <div class="footer-copyright text-center py-3">© 2018 Copyright:
    <a href=""> Quentin Cheval</a>
  </div>
  



<script>
function myMap() {
	
	var myLatLng = {lat: 43.418641, lng: 5.277849};

var map=new google.maps.Map(document.getElementById("googleMap"), {
	center: myLatLng,
 	zoom:10,
});
var marker = new google.maps.Marker({position: myLatLng});
marker.setMap(map);
}

new google.maps.LatLng(43.418641, 5.277849)


</script>

<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBObVnPbECAhbrCipUzrcueF4F2QFY5lzI&callback=myMap"></script>


</footer>