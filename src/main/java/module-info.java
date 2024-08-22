module com.example.pedidoentrega {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.pedidoentrega to javafx.fxml;
    exports com.example.pedidoentrega;
}