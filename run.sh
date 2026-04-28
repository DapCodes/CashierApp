#!/bin/bash

# Folder untuk file hasil kompilasi
OUT_DIR="out"

# Membuat folder out jika belum ada
mkdir -p "$OUT_DIR"

echo "🛠️ Compiling Java files..."

# Mencari semua file .java di dalam direktori src dan menyimpan path-nya ke sources.txt
find src -name "*.java" > sources.txt

# Kompilasi semua file yang ada di sources.txt
# -d: Menentukan direktori output untuk file .class
# -cp: Menentukan classpath, termasuk semua file .jar di dalam folder lib
javac -d "$OUT_DIR" -cp "lib/*" @sources.txt

# Mengecek apakah proses kompilasi berhasil (exit status = 0)
if [ $? -eq 0 ]; then
    echo "✅ Berhasil dikompilasi!"
    echo "🚀 Sedang menjalankan aplikasi..."
    echo "=================================================="
    
    # Menjalankan aplikasi
    # Classpath mencakup folder out dan semua .jar di folder lib
    # (Di Windows classpath pemisahnya menggunakan ;, namun di Linux/Mac menggunakan :)
    java -cp "$OUT_DIR:lib/*" Main
else
    echo "❌ Terjadi kesalahan saat kompilasi. Silakan periksa kembali error di atas."
fi

# Menghapus file sementara sources.txt
rm sources.txt
