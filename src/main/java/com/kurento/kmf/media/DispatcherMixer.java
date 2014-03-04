package com.kurento.kmf.media;

import com.kurento.tool.rom.RemoteClass;
import com.kurento.tool.rom.server.Param;

@RemoteClass
public interface DispatcherMixer extends MediaMixer {

	void setSource(@Param("source") MixerPort source);

	void setSource(@Param("source") MixerPort source, Continuation<Void> cont);

	void removeSource();

	void removeSource(Continuation<Void> cont);

	public interface Factory {

		public Builder create(
				@Param("mediaPipeline") MediaPipeline mediaPipeline);
	}

	public interface Builder extends AbstractBuilder<DispatcherMixer> {

		public Builder withGarbagePeriod(int garbagePeriod);
	}
}
