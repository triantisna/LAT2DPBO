<?php

    class Human{
        private $NIK = '';
        private $nama = '';
        private $jenis_kelamin = '';

        public function __construct($NIK = '', $nama = '', $jenis_kelamin = ''){
            $this->NIK = $NIK;
            $this->nama = $nama;
            $this->jenis_kelamin = $jenis_kelamin;
        }

        public function set_NIK($NIK){
            $this->NIK = $NIK;
        }
        public function get_NIK(){
            return $this->NIK;
        }

        public function set_nama($nama){
            $this->nama = $nama;
        }
        public function get_nama(){
            return $this->nama;
        }

        public function set_jenis_kelamin($jenis_kelamin){
            $this->jenis_kelamin = $jenis_kelamin;
        }
        public function get_jenis_kelamin(){
            return $this->jenis_kelamin;
        }
    }


?>