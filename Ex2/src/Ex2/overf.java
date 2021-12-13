package Ex2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class overf {



    private static void desirialize() {
        try {
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(Graph.class, new JsonToGraph());
            Gson gson = builder.create();

            FileReader reader = new FileReader("data/G1.json");
            Graph graph  = gson.fromJson(reader, Graph.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


































//public class overf {
//    public static void main(String[] args) {
//
//        JSONParser parser = new JSONParser();
//
//        try {
//            Object obj = parser.parse(new FileReader("c:\\file.json"));
//
//            JSONObject jsonObject =  (JSONObject) obj;
//
//            String name = (String) jsonObject.get("name");
//            System.out.println(name);
//
//            String city = (String) jsonObject.get("city");
//            System.out.println(city);
//
//            String job = (String) jsonObject.get("job");
//            System.out.println(job);
//
//            // loop array
//            JSONArray cars = (JSONArray) jsonObject.get("cars");
//            Iterator<String> iterator = cars.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
//}