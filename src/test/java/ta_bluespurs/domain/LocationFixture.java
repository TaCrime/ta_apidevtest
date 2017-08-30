package ta_bluespurs.domain;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.Collections;
import java.util.List;

public class LocationFixture {

    public static final String ITEMS_KEY = "items";
    public static final String PRICE_KEY = "price";
    public static final String NAME_KEY = "name";

    public static Location createLocation() {
        return builder().build();
    }

    public static LocationFixtureBuilder builder() {
        return new LocationFixtureBuilder();
    }

    public static class LocationFixtureBuilder {
        private LocationTypes type = LocationTypes.WALMART;
        private String scheme = "http1";
        private String host = "www.test";
        private String path = "/";
        private String searchByNameParamName = "";
        private List<RequestParam> parameters = Collections.emptyList();
        private String items_key = ITEMS_KEY;
        private String price_key = PRICE_KEY;
        private String name_key = NAME_KEY;


        public Location build() {
            return new Location(type, scheme, host, path, searchByNameParamName, parameters, items_key, price_key, name_key);
        }

        public LocationFixtureBuilder setType(LocationTypes type) {
            this.type = type;
            return this;
        }

        public LocationFixtureBuilder setParameters(List<RequestParam> parameters) {
            this.parameters = parameters;
            return this;
        }
    }
}
