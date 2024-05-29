import java.util.*;
interface Searchable {
    List<SchoolProfile> search(String criteria);
}

// Search functionality implementing Searchable interface
class SchoolSearch implements Searchable {
    private List<SchoolProfile> schoolProfiles;

    public SchoolSearch(List<SchoolProfile> schoolProfiles) {
        this.schoolProfiles = schoolProfiles;
    }

    @Override
    public List<SchoolProfile> search(String criteria) {
        List<SchoolProfile> results = new ArrayList<>();
        for (SchoolProfile profile : schoolProfiles) {
            if (profile.name.contains(criteria) || profile.location.contains(criteria)) {
                results.add(profile);
            }
        }
        return results;
    }
}

