package org.apache.sanselan.common;

import java.awt.image.BufferedImage;

public class SimpleBufferedImageFactory implements IBufferedImageFactory
{
	public BufferedImage getColorBufferedImage(int width, int height,
			boolean hasAlpha)
	{
		if (hasAlpha)
			return new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		return new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	}

	public BufferedImage getGrayscaleBufferedImage(int width, int height,
			boolean hasAlpha)
	{
		if (hasAlpha)
			return new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		return new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
	}
}