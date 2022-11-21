// Generated from sysc.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link syscParser}.
 */
public interface syscListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link syscParser#compunit}.
	 * @param ctx the parse tree
	 */
	void enterCompunit(syscParser.CompunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#compunit}.
	 * @param ctx the parse tree
	 */
	void exitCompunit(syscParser.CompunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(syscParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(syscParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#constdecl}.
	 * @param ctx the parse tree
	 */
	void enterConstdecl(syscParser.ConstdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#constdecl}.
	 * @param ctx the parse tree
	 */
	void exitConstdecl(syscParser.ConstdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBtype(syscParser.BtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBtype(syscParser.BtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#constdef}.
	 * @param ctx the parse tree
	 */
	void enterConstdef(syscParser.ConstdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#constdef}.
	 * @param ctx the parse tree
	 */
	void exitConstdef(syscParser.ConstdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#constinitval}.
	 * @param ctx the parse tree
	 */
	void enterConstinitval(syscParser.ConstinitvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#constinitval}.
	 * @param ctx the parse tree
	 */
	void exitConstinitval(syscParser.ConstinitvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(syscParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(syscParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(syscParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(syscParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#initval}.
	 * @param ctx the parse tree
	 */
	void enterInitval(syscParser.InitvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#initval}.
	 * @param ctx the parse tree
	 */
	void exitInitval(syscParser.InitvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(syscParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(syscParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#functype}.
	 * @param ctx the parse tree
	 */
	void enterFunctype(syscParser.FunctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#functype}.
	 * @param ctx the parse tree
	 */
	void exitFunctype(syscParser.FunctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#funcfparams}.
	 * @param ctx the parse tree
	 */
	void enterFuncfparams(syscParser.FuncfparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#funcfparams}.
	 * @param ctx the parse tree
	 */
	void exitFuncfparams(syscParser.FuncfparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#funcfparam}.
	 * @param ctx the parse tree
	 */
	void enterFuncfparam(syscParser.FuncfparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#funcfparam}.
	 * @param ctx the parse tree
	 */
	void exitFuncfparam(syscParser.FuncfparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(syscParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(syscParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#blockitem}.
	 * @param ctx the parse tree
	 */
	void enterBlockitem(syscParser.BlockitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#blockitem}.
	 * @param ctx the parse tree
	 */
	void exitBlockitem(syscParser.BlockitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(syscParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(syscParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(syscParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(syscParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(syscParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(syscParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#lval}.
	 * @param ctx the parse tree
	 */
	void enterLval(syscParser.LvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#lval}.
	 * @param ctx the parse tree
	 */
	void exitLval(syscParser.LvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#primaryexp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryexp(syscParser.PrimaryexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#primaryexp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryexp(syscParser.PrimaryexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(syscParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(syscParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#unaryexp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexp(syscParser.UnaryexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#unaryexp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexp(syscParser.UnaryexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#unaryop}.
	 * @param ctx the parse tree
	 */
	void enterUnaryop(syscParser.UnaryopContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#unaryop}.
	 * @param ctx the parse tree
	 */
	void exitUnaryop(syscParser.UnaryopContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#funcrparams}.
	 * @param ctx the parse tree
	 */
	void enterFuncrparams(syscParser.FuncrparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#funcrparams}.
	 * @param ctx the parse tree
	 */
	void exitFuncrparams(syscParser.FuncrparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#mulexp}.
	 * @param ctx the parse tree
	 */
	void enterMulexp(syscParser.MulexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#mulexp}.
	 * @param ctx the parse tree
	 */
	void exitMulexp(syscParser.MulexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#addexp}.
	 * @param ctx the parse tree
	 */
	void enterAddexp(syscParser.AddexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#addexp}.
	 * @param ctx the parse tree
	 */
	void exitAddexp(syscParser.AddexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#relexp}.
	 * @param ctx the parse tree
	 */
	void enterRelexp(syscParser.RelexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#relexp}.
	 * @param ctx the parse tree
	 */
	void exitRelexp(syscParser.RelexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#eqexp}.
	 * @param ctx the parse tree
	 */
	void enterEqexp(syscParser.EqexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#eqexp}.
	 * @param ctx the parse tree
	 */
	void exitEqexp(syscParser.EqexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#landexp}.
	 * @param ctx the parse tree
	 */
	void enterLandexp(syscParser.LandexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#landexp}.
	 * @param ctx the parse tree
	 */
	void exitLandexp(syscParser.LandexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#lorexp}.
	 * @param ctx the parse tree
	 */
	void enterLorexp(syscParser.LorexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#lorexp}.
	 * @param ctx the parse tree
	 */
	void exitLorexp(syscParser.LorexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link syscParser#constexp}.
	 * @param ctx the parse tree
	 */
	void enterConstexp(syscParser.ConstexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link syscParser#constexp}.
	 * @param ctx the parse tree
	 */
	void exitConstexp(syscParser.ConstexpContext ctx);
}