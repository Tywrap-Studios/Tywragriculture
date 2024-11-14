package net.tywrapstudios.agriculture.util;

import net.fabricmc.loader.api.FabricLoader;

import java.util.List;
import java.util.Random;

public class Util {
    public static String generateInitPhrase() {
        final List<String> INIT_PHRASES = List.of(
                "Fawming Fwunny UwU",
                "Ah yes I love Config formatting version AAAA it reminds me of my mental health. - Tiazzz",
                "Dot put te fok in te micorwafe waltuh",
                "Roses are red, violets are blue, unexpected \"{\" at line 32.",
                "So like what the f*ck is a Tywrgaricultuerre?",
                "garlic bread?",
                "\"glorps glop bieb bobls\" - The Aliens saying this mod is fire",
                "ORAJ POLE NA TRAKTORE HEY HOOP SJABADABA",
                "Z-O-O-M, talk a lot on Twitter bish I'm not yo friend"
        );

        return INIT_PHRASES.get(new Random().nextInt(INIT_PHRASES.size()));
    }

    public static String getModVer(String modId) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            return FabricLoader.getInstance().getModContainer(modId).get().getMetadata().getVersion().getFriendlyString();
        } else {
            return String.format("\"%s\" version not found, mod isn't loaded.", modId);
        }
    }
}