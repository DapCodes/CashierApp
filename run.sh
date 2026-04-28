OUT_DIR="out"

mkdir -p "$OUT_DIR"

echo "Compiling Java files..."

find src -name "*.java" > sources.txt

javac -d "$OUT_DIR" -cp "lib/*" @sources.txt

if [ $? -eq 0 ]; then
    echo "Compilation successful"
    echo "Running application..."
    echo "=================================================="

    java -cp "$OUT_DIR:lib/*" Main
else
    echo "Compilation failed. Please check the errors above."
fi

rm sources.txt