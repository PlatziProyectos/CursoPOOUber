<?php
    class Payment {
        public $id;

        public function __construct($id){
            $this->id = $id;
        }

        public function __toString(){
            return "[id : $this->id]";
        }
    }
?>