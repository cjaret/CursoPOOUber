<?php
require_once('car.php');
class UberX extends Car {
    
    public $brand; //Atributos propios de UberX
    public $model;

    public function __construct($license, $driver /* <-Estos dos parámetros serán enviados a la clase padre */,
    $brand, $model /* <-Estos son parámetros de la subclase actual */){
        parent::__construct($license,$driver); /* Clase padre */
        $this->brand = $brand;
        $this->model = $model;
    }

}
?>