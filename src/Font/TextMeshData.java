/*
 * Dylan Gilson
 * dylan.gilson@outlook.com
 * May 2, 2021
 */

package Font;

/**
 * Stores the vertex data for all the quads on which a text will be rendered.
 *
 * @author Eliseo
 *
 */
public class TextMeshData {
	
	private float[] vertexPositions;
	private float[] textureCoords;
	
	protected TextMeshData(float[] vertexPositions, float[] textureCoords) {
		this.vertexPositions = vertexPositions;
		this.textureCoords = textureCoords;
	}

	public float[] getVertexPositions() {
		return vertexPositions;
	}

	public float[] getTextureCoords() {
		return textureCoords;
	}

	public int getVertexCount() {
		return vertexPositions.length / 2;
	}
}
