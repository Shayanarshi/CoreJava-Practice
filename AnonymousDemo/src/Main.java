public class Main {
    public static void main(String[] args) {
        Template template = new Template();
        RowMapper rowMapper = new RowMapper() {
            @Override
            public String mapRow() {
                return "row is mapped";
            }
        };

        template.query(rowMapper);
    }
}
