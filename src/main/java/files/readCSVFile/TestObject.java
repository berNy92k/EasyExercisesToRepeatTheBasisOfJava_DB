package files.readCSVFile;

public class TestObject {
    private String table;
    private String breakdown;
    private String secondaryBreakdown;
    private String year;
    private String value;
    private String unit;

    private TestObject() {
    }

    public String getTable() {
        return table;
    }

    public String getBreakdown() {
        return breakdown;
    }

    public String getSecondaryBreakdown() {
        return secondaryBreakdown;
    }

    public String getYear() {
        return year;
    }

    public String getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public TestObject(Builder builder) {
        this.table = builder.table;
        this.breakdown = builder.breakdown;
        this.secondaryBreakdown = builder.secondaryBreakdown;
        this.year = builder.year;
        this.value = builder.value;
        this.unit = builder.unit;
    }

    public static class Builder {
        private String table;
        private String breakdown;
        private String secondaryBreakdown;
        private String year;
        private String value;
        private String unit;

        public Builder setTable(String table) {
            this.table = table;
            return this;
        }

        public Builder setBreakdown(String breakdown) {
            this.breakdown = breakdown;
            return this;
        }

        public Builder setSecondaryBreakdown(String secondaryBreakdown) {
            this.secondaryBreakdown = secondaryBreakdown;
            return this;
        }

        public Builder setYear(String year) {
            this.year = year;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = unit;
            return this;
        }

        public TestObject build() {
            return new TestObject(this);
        }
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "table='" + table + '\'' +
                ", breakdown='" + breakdown + '\'' +
                ", secondaryBreakdown='" + secondaryBreakdown + '\'' +
                ", year='" + year + '\'' +
                ", value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
