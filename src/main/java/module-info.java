module ruan.caetano.atividadejavasegbi {
    requires javafx.controls;
    requires javafx.fxml;


    opens ruan.caetano.atividadejavasegbi to javafx.fxml;
    exports ruan.caetano.atividadejavasegbi;
}