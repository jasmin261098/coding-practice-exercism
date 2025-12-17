import java.util.Map;
import java.util.HashMap;

public class DialingCodes {

    public Map<Integer, String> dialingCodesMap = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodesMap;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodesMap.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodesMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!dialingCodesMap.containsKey(code) &&                             
            !dialingCodesMap.containsValue(country)) {
            dialingCodesMap.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : dialingCodesMap.entrySet()) {
            if ((country == null && entry.getValue() == null) || (country != null && country.equals(entry.getValue()))) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (findDialingCode(country) != null) {
            dialingCodesMap.remove(findDialingCode(country));
            dialingCodesMap.put(code, country);
        }
    }
}
