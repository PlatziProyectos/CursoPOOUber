<?php
    class Route {
        private $id;
        private $start;
        private $end;

        public function __construct($id){
            $this->id = $id;
        }

        public function __toString(){
            return "[id : $this->id, start : $this->start, end : $this->end]";
        }    
    }
?>