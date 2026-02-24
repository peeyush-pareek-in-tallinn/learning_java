package ee.peeyushlearningjava.FunctionalProgramming;

import java.util.Optional;

public class FunctionForOptionalString implements OptionalString{

    @Override
    public Optional<String> isStringPresent(String str) {
        if (str == null || str.trim().isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(str);
    }
}
