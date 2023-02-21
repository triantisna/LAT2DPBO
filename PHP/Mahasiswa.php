<?php

    class Mahasiswa{
        private $NIM = '';
        private $nama = '';
        private $jenis_kelamin = '';
        private $fakultas = '';
        private $prodi = '';

        public function __construct($NIM = '', $nama = '', $jenis_kelamin = '',
                        $fakultas = '', $prodi = ''){
            $this->NIM = $NIM;
            $this->nama = $nama;
            $this->jenis_kelamin = $jenis_kelamin;
            $this->fakultas = $fakultas;
            $this->prodi = $prodi;
        }

        public function set_NIM($NIM){
            $this->NIM = $NIM;
        }
        public function get_NIM(){
            return $this->NIM;
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

        public function set_fakultas($fakultas){
            $this->fakultas = $fakultas;
        }
        public function get_fakultas(){
            return $this->fakultas;
        }

        public function set_prodi($prodi){
            $this->prodi = $prodi;
        }
        public function get_prodi(){
            return $this->prodi;
        }
    }


?>