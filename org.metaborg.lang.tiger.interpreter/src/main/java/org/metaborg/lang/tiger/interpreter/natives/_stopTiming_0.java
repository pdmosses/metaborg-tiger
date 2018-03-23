package org.metaborg.lang.tiger.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.NativeOpBuild;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

public abstract class _stopTiming_0 extends NativeOpBuild {

	public _stopTiming_0(SourceSection source) {
		super(source);
	}

	@Specialization
	public int doStart() {
		int endTime = (int) (System.currentTimeMillis() % 100000) -  _startTiming_0.startTime;
		return endTime;
	}

	public static NativeOpBuild create(SourceSection source) {
		return _stopTiming_0NodeGen.create(source);
	}

}
