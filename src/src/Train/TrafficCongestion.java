package Train;

public enum TrafficCongestion {

    TRANSPORT_IS_LOADED("полный"),
    TRANSPORT_IS_EMPTY("пустой");
     private String type;

   //TrafficCongestion() {
   // }

    TrafficCongestion(String type) {
         this.type = type;
    }

}
