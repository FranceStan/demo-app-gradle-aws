/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {

    public static void main(String[] args) {
       // Appel des fonctions de création et suppression de bucket de la classe S3Manager
        S3Manager s3Manager = new S3Manager();
        s3Manager.createBucket("mon-bucket-test-java");
        s3Manager.deleteBucket("mon-bucket-test-java");

        // Appel des fonctions de création et suppression d'utilisateur IAM de la classe IAMManager
        IAMManager iamManager = new IAMManager();
        iamManager.createUser("utilisateur-test-java");
        iamManager.deleteUser("utilisateur-test-java");
    }
}


