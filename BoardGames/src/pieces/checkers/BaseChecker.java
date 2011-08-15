package pieces.checkers;

import game.promotiongames.CheckersGame;
import pieces.PieceType;
import player.Player;

public final class BaseChecker extends AbstractChecker {

  private static final PieceType type = PieceType.BASE_CHECKER;

  public BaseChecker(int row, int col, CheckersGame game, Player player) {
    super(game, player);
  }

  @Override
  protected void addAllMoves() {
    addCapturingMoves();
    addForwardsNonCapturingMoves();
  }

  @Override
  protected void addCapturingMoves() {
    addForwardsCapturingMoves();
    if (!game.getRules().isMenCaptureBackwards()) return;
    addBackwardsCapturingMoves();
  }

  @Override
  public PieceType getType() {
    return type;
  }
}
