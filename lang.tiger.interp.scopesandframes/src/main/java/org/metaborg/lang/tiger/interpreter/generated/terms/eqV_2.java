package org.metaborg.lang.tiger.interpreter.generated.terms;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.spoofax.interpreter.terms.IStrategoTerm;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;

public final class eqV_2 extends eqV_2_Meta {
	public final static String CONSTRUCTOR = "eqV";

	public final static int ARITY = 2;

	public eqV_2(V _1, V _2) {
		this(_1, _2, null);
	}

	private eqV_2(V _1, V _2, IStrategoTerm strategoTerm) {
		this._1 = _1;
		this._2 = _2;
		this.strategoTerm = strategoTerm;
	}

	private final V _1;

	private final V _2;

	public V get_1() {
		return _1;
	}

	public V get_2() {
		return _2;
	}

	@TruffleBoundary
	public static eqV_2 create(IStrategoTerm term) {
		throw new IllegalStateException("Value terms and metafunctions cannot be created from Stratego terms");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		eqV_2 other = (eqV_2) obj;
		if (_1 == null) {
			if (other._1 != null) {
				return false;
			}
		} else if (!_1.equals(other._1)) {
			return false;
		}
		if (_2 == null) {
			if (other._2 != null) {
				return false;
			}
		} else if (!_2.equals(other._2)) {
			return false;
		}
		return true;
	}

	private final IStrategoTerm strategoTerm;

	@Override
	public int size() {
		return ARITY;
	}

	@Override
	public boolean hasStrategoTerm() {
		return strategoTerm != null;
	}

	@Override
	public IStrategoTerm getStrategoTerm() {
		return strategoTerm;
	}

	@TruffleBoundary
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(CONSTRUCTOR);
		sb.append("(");
		sb.append(_1);
		sb.append(", ");
		sb.append(_2);
		sb.append(")");
		return sb.toString();
	}

	@CompilationFinal
	private boolean hashCodeComputed;

	@CompilationFinal
	private int hashcode;

	@Override
	public int hashCode() {
		if (!hashCodeComputed) {
			CompilerDirectives.transferToInterpreterAndInvalidate();
			hashcode = makeHashCode();
			hashCodeComputed = true;
		}
		return hashcode;
	}

	@TruffleBoundary
	private int makeHashCode() {
		return new HashCodeBuilder().append(_2).append(_1).toHashCode();
	}
}