class SivitasAkademik:

    __asal_univ = ""
    __email_edu = ""

    def __init__(self, asal_univ = "", email_edu = ""):
        self.__asal_univ = asal_univ
        self.__email_edu = email_edu

    def get_asal_univ(self):
        return self.__asal_univ

    def set_asal_univ(self, asal_univ):
        self.__asal_univ = asal_univ

    def get_email_edu(self):
        return self.__email_edu

    def set_email_edu(self, email_edu):
        self.__email_edu = email_edu