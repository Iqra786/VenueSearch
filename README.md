This application searches venues within the desired location. We have to give the venue of interest and location otherwise it will not process the request.

I have used Model View Presenter(MVP) Patteren to design this application.

Model :- 
  pojo_Model - All the data mapping class
  Data_Manager package is used to communicate with pojo model.

Presenter: 
Each view has its own presenter that is used to communcate with the Model and update View

View:
Presenter will update the view.

I have used Retrofit for json parsing  with Rxjava. 

Issues:- 
I haven't handled configration change because of time constraints.






