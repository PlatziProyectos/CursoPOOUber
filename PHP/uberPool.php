<?php
    require_once('car.php');

    class UberPool extends Car {
        public $brand;
        public $model;

        public function __construct($id, $license, $driver, $brand, $model) {
            parent::__construct($id, $license, $driver);
            $this->brand = $brand;
            $this->model = $model;
        }

    }

?>