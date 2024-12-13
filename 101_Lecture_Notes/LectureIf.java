/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("kevin is going on journey to rehab his shoulder ");    
    System.out.println("what way would u like to become the King of Giving Shoulder");
    System.out.println("1.Option 1: The Ancient Healer ");
    System.out.println("2.Option 2: The Modern Rehabilitation Clinic ");
    System.out.println("3.Option 3: The DIY Adventure  ");

    int answer = sc.nextInt();
    if(answer1 == 1){
        System.out.println("Kevin hears rumors of an ancient healer living in the mountains. Legend has it that this healer possesses unique knowledge of herbal remedies and traditional techniques. Kevin and his friends trek through the dense forest, overcoming obstacles like fallen trees and rushing streams. When they finally reach the healer's secluded cabin, Kevin learns about a powerful herbal poultice and ancient stretching techniques that could alleviate his shoulder pain. Will the wisdom of the healer be enough to restore Kevin's strength?");
    }
    else if(answer1 == 2){
        System.out.println("Kevin's friend suggests visiting a cutting-edge rehabilitation clinic known for its innovative treatments. They navigate the bustling city, overcoming urban challenges like traffic and construction, until they arrive at the clinic. Here, Kevin meets a team of skilled therapists who introduce him to advanced therapies, including physical therapy and hydrotherapy. As he pushes through the intense sessions, Kevin learns the importance of patience and perseverance. Will modern science help him reclaim his climbing abilities?");
        
    }
    else if(answer1 == 3){
        System.out.println("Determined to take matters into his own hands, Kevin decides to create a DIY healing adventure. He researches various shoulder exercises, yoga practices, and nutrition tips to heal his body naturally. Armed with a notebook, he and his friends embark on a weekend camping trip where they focus on wellness. They hike, practice yoga at sunrise, and prepare nourishing meals. As they bond around the campfire, Kevin discovers the power of self-care and mindfulness. Will this journey of self-discovery help him heal?");
    }
    else{
        System.out.println("Conclusion: Each option presents unique challenges and growth opportunities for Kevin. As he navigates through his adventure, he not only seeks to fix his shoulder but also learns valuable lessons about resilience, friendship, and the importance of listening to his body. No matter which path he chooses, the adventure itself will be transformative.");
        
    }
    
    
    
    
	}
}