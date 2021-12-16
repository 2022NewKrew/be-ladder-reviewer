package cole.kakao.com;

import java.io.InputStream;

interface LadderGame {

    LadderGameParams inputGameParams(InputStream inputStream);

    String show(LadderGameParams params);

    class LadderGameParams {

        public final int numParticipants;
        public final int maxLadderHeight;

        public LadderGameParams(int numParticipants, int maxLadderHeight) {
            this.numParticipants = numParticipants;
            this.maxLadderHeight = maxLadderHeight;
        }
    }
}
