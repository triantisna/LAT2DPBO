from Human import Human

Trian = Human()
Trian.set_nama("Trian")
Trian.set_NIM("2001408")
Trian.set_NIK("000112333")
Trian.set_jenis_kelamin("Laki-Laki")
Trian.set_email_edu("triannih@email.edu")
Trian.set_asal_univ("UPI")
Trian.set_fakultas("Depilkom")
Trian.set_prodi("Ilmu Komputer")

print()
print(">> Data Mahasiswa Cumlaude <<")
print("Nama         :", Trian.get_nama())
print("NIM          :", Trian.get_NIM())
print("NIK          :", Trian.get_NIK())
print("Kelamin      :", Trian.get_jenis_kelamin())
print("E-Mail       :", Trian.get_email_edu())
print("Universitas  :", Trian.get_asal_univ())
print("Fakultas     :", Trian.get_fakultas())
print("Prodi        :", Trian.get_prodi())
