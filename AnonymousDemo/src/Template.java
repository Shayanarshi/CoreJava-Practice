public class Template {
    void query(RowMapper rowMapper){
        String result = rowMapper.mapRow();
        System.out.println(result.toUpperCase());

    }
}
