from SivitasAkademik import SivitasAkademik

class Mahasiswa(SivitasAkademik):

    __NIM = ""
    __nama = ""
    __jenis_kelamin = ""
    __fakultas = ""
    __prodi = ""

    def __init__(self, NIM = "", nama = "", jenis_kelamin = "",
                fakultas = "", prodi = ""):
        self.__NIM = NIM
        self.__nama = nama
        self.__jenis_kelamin = jenis_kelamin
        self.__fakultas = fakultas
        self.__prodi = prodi

    def get_NIM(self):
        return self.__NIM

    def set_NIM(self, NIM):
        self.__NIM = NIM

    def get_nama(self):
        return self.__nama

    def set_nama(self, nama):
        self.__nama = nama

    def get_jenis_kelamin(self):
        return self.__jenis_kelamin

    def set_jenis_kelamin(self, jenis_kelamin):
        self.__jenis_kelamin = jenis_kelamin

    def get_fakultas(self):
        return self.__fakultas

    def set_fakultas(self, fakultas):
        self.__fakultas = fakultas

    def get_prodi(self):
        return self.__prodi

    def set_prodi(self, prodi):
        self.__prodi = prodi