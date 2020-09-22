package Jacson;

import java.io.IOException;

public class main {


    public static void main(String[] args) throws IOException {

       /* ObjectMapper mapper = new ObjectMapper();
        Friend friend = new Friend("yitian", 25);
        // 写为字符串
        String text = mapper.writeValueAsString(friend);
        System.out.println(text);

        mapper.writeValue(new File("friend.json"), friend);

        byte[] bytes = mapper.writeValueAsBytes(friend);
        System.out.println(mapper);
        System.out.println(bytes);
        Friend newFriend = mapper.readValue(text, Friend.class);
        System.out.println(newFriend.getAge());
        // 从字节流中读取
        newFriend = mapper.readValue(bytes, Friend.class);
        // 从文件中读取
        newFriend = mapper.readValue(new File("friend.json"), Friend.class);
        System.out.println(newFriend);*/


/*        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> map = new HashMap<>();
        map.put("age", 25);
        map.put("name", "yitian");
        map.put("interests", new String[]{"pc games", "music"});

        String text = mapper.writeValueAsString(map);
        System.out.println(text);

        Map<String, Object> map2 = mapper.readValue(text, new TypeReference<Map<String, Object>>() {
        });
        System.out.println(map2);

        JsonNode root = mapper.readTree(text);
        String name = root.get("name").asText();
        int age = root.get("age").asInt();

        System.out.println("name:" + name + " age:" + age);


        // 美化输出
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
// 允许序列化空的POJO类
// （否则会抛出异常）
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
// 把java.util.Date, Calendar输出为数字（时间戳）
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

// 在遇到未知属性的时候不抛出异常
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
// 强制JSON 空字符串("")转换为null对象值:
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

// 在JSON中允许C/C++ 样式的注释(非标准，默认禁用)
        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
// 允许没有引号的字段名（非标准）
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
// 允许单引号（非标准）
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
// 强制转义非ASCII字符
        mapper.configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);
// 将内容包裹为一个JSON属性，属性名由@JsonRootName注解指定
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);*/

     /*   ObjectMapper mapper = new ObjectMapper();
        //mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        FriendDetail fd = new FriendDetail("yitian", 25, "", 0, "");
        String text = mapper.writeValueAsString(fd);
        System.out.println(text);

        FriendDetail fd2 = mapper.readValue(text, FriendDetail.class);
        System.out.println(fd2);*/


    /*    ObjectMapper mapper = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .registerModule(new ParameterNamesModule())
                .registerModule(new Jdk8Module());*/

    }











}
