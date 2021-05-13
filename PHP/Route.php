<?php
    class Route {
        private $id;
        private $start;
        private $end;

        public function __construct($id){
            $this->id = $id;
        }

        public function toString(){
            echo "id : $this->id";
        }    
    }
?>