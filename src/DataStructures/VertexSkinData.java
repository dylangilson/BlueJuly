/*
 * Dylan Gilson
 * dylan.gilson@outlook.com
 * July 3, 2021
 */

package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class VertexSkinData {
	
	public final List<Integer> jointIDs = new ArrayList<Integer>();
	public final List<Float> weights = new ArrayList<Float>();
	
	public void addJointEffect(int jointID, float weight) {
		for (int i = 0; i < weights.size(); i++) {
			if (weight > weights.get(i)) {
				jointIDs.add(i, jointID);
				weights.add(i, weight);

				return;
			}
		}

		jointIDs.add(jointID);
		weights.add(weight);
	}
	
	public void limitJointNumber(int max) {
		if (jointIDs.size() > max) {
			float[] topWeights = new float[max];
			float total = saveTopWeights(topWeights);
			refillWeightList(topWeights, total);
			removeExcessJointIDs(max);
		} else if (jointIDs.size() < max) {
			fillEmptyWeights(max);
		}
	}

	private void fillEmptyWeights(int max) {
		while (jointIDs.size() < max) {
			jointIDs.add(0);
			weights.add(0f);
		}
	}
	
	private float saveTopWeights(float[] topWeightsArray) {
		float total = 0;

		for (int i = 0; i < topWeightsArray.length; i++) {
			topWeightsArray[i] = weights.get(i);
			total += topWeightsArray[i];
		}

		return total;
	}
	
	private void refillWeightList(float[] topWeights, float total) {
		weights.clear();

		for (int i = 0; i < topWeights.length; i++) {
			weights.add(Math.min(topWeights[i] / total, 1));
		}
	}
	
	private void removeExcessJointIDs(int max) {
		while (jointIDs.size() > max) {
			jointIDs.remove(jointIDs.size() - 1);
		}
	}
}
