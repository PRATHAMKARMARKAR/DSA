#include<iostream>
using namespace std;
void Selection_Sort(int arr[],int n){
    for (int i = 0; i <= n-2; i++)
    {
        int mini = i;
        for (int j = i; j <= n-1; j++)
        {
            if (arr[j]<arr[mini])
            {
                mini = j;
            }
        }
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }
}
int main(){
    int n;
    cout<<"Enter The Size Of Array ->"<<" ";
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    Selection_Sort(arr,n);
    cout<<"Array After Sorting ->"<<" ";
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0;
}