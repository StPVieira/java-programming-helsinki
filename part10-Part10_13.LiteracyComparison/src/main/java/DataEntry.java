public class DataEntry {
        String originalLine;
        double value;

        DataEntry(String originalLine, double value) {
            this.originalLine = originalLine;
            this.value = value;
        }

        @Override
        public String toString() {
            return originalLine;
        }
    }